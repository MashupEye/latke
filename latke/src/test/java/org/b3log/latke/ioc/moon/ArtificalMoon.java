/*
 * Copyright (c) 2009-2016, b3log.org & hacpai.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.ioc.moon;

import javax.inject.Inject;
import org.b3log.latke.ioc.moon.annotation.Artifical;

/**
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.2, Nov 5, 2009
 */
@Artifical
public class ArtificalMoon extends Moon {

    String description = "default description of artifical moon";

    @Override
    @Inject
    void initDescription() {
        System.out.println("In ArtificalMoon initDes method");
        description = "artifical";
    }

    @Override
    void initWeight() {
        throw new UnsupportedOperationException();
    }
}
