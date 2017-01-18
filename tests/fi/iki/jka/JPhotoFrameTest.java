package fi.iki.jka;

import org.exolab.castor.types.Date;
import org.exolab.castor.types.DateTimeBase;
import org.exolab.castor.xml.validators.DateTimeValidator;
import org.junit.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fi.iki.jka.JPhotoFrame.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void StartSlideshow() throws Exception {
        final ActionEvent event = new ActionEvent("", 1, "Start Slideshow", System.currentTimeMillis(), 0);


        JPhotoFrame frame = new JPhotoFrame("frame", new String[]{"123"});
        frame.actionPerformed(event);

    }
}