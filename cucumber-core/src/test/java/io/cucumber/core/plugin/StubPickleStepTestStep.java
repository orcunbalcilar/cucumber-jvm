package io.cucumber.core.plugin;

import io.cucumber.plugin.event.Argument;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Step;
import io.cucumber.plugin.event.StepArgument;

import java.net.URI;
import java.util.List;
import java.util.UUID;

class StubPickleStepTestStep implements PickleStepTestStep {

    @Override
    public String getPattern() {
        return null;
    }

    @Override
    public Step getStep() {
        return null;
    }

    @Override
    public List<Argument> getDefinitionArgument() {
        return null;
    }

    @Override
    public StepArgument getStepArgument() {
        return null;
    }

    @Override
    public int getStepLine() {
        return 0;
    }

    @Override
    public URI getUri() {
        return null;
    }

    @Override
    public String getStepText() {
        return null;
    }

    @Override
    public String getCodeLocation() {
        return null;
    }

    @Override
    public UUID getId() {
        return null;
    }
}
