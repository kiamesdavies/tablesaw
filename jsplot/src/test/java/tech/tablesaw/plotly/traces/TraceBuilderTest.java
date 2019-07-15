package tech.tablesaw.plotly.traces;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TraceBuilderTest {

    
    @Test
    public void shouldFailPreconditionTest() {
        TraceBuilder traceBuilder = new TraceBuilder() {
            @Override
            protected String getType() {
                return "dummy";
            }
        };

        assertThrows(IllegalArgumentException.class, () -> {
            traceBuilder.xAxis("xa");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            traceBuilder.yAxis("yy");
        });
    }
    
    @Test
    public void shouldBeAbleToSetAxis(){
        String xAxis ="x1";
        String yAxis = "y";
        TraceBuilder traceBuilder = new TraceBuilder() {
            @Override
            protected String getType() {
                return "dummy";
            }
        };
        traceBuilder.xAxis(xAxis).yAxis(yAxis);
        Assertions.assertEquals(xAxis, traceBuilder.xAxis);
        Assertions.assertEquals(yAxis, traceBuilder.yAxis);
    }
}
