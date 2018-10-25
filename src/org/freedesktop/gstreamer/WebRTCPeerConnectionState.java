/*
 * Copyright (c) 2018 Antonio Morales
 * 
 * This file is part of gstreamer-java.
 *
 * This code is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License version 3 only, as published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License version 3 along with
 * this work. If not, see <http://www.gnu.org/licenses/>.
 */

package org.freedesktop.gstreamer;

import org.freedesktop.gstreamer.lowlevel.EnumMapper;
import org.freedesktop.gstreamer.lowlevel.IntegerEnum;

/**
 * The state of a WebRTC peer connection
 * Available since GStreamer 1.14
 */
public enum WebRTCPeerConnectionState implements IntegerEnum {
    /** New WebRTC connection */
    NEW(0),
    /** A WebRTC connection is being made */
    CONNECTING(1),
    /** A WebRTC connection has been made */
    CONNECTED(2),
    /** A WebRTC connection has been disconnected */
    DISCONNECTED(3),
    /** Attempt to make a WebRTC connection failed */
    FAILED(4),
    /** A WebRTC connection has been closed */
    CLOSED(5);

    WebRTCPeerConnectionState(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static final WebRTCPeerConnectionState valueOf(int state) {
        return EnumMapper.getInstance().valueOf(state, WebRTCPeerConnectionState.class);
    }

    private final int value;
}
