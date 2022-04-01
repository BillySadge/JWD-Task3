package by.tc.task01.entity.appliance.builder;

import by.tc.task01.entity.appliance.Speakers;

public class SpeakersBuilder {
    private double powerConsumption;
    private double numberOfSpeakers;
    private double frequencyRange;
    private double cordLength;

    public SpeakersBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public SpeakersBuilder setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
        return this;
    }

    public SpeakersBuilder setFrequencyRange(double frequencyRange) {
        this.frequencyRange = frequencyRange;
        return this;
    }

    public SpeakersBuilder setCordLength(double cordLength) {
        this.cordLength = cordLength;
        return this;
    }

    public Speakers createSpeakers() {
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}