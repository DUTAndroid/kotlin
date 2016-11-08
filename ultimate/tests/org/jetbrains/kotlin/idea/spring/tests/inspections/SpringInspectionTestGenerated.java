/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.spring.tests.inspections;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("ultimate/testData/inspections/spring")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SpringInspectionTestGenerated extends AbstractSpringInspectionTest {
    public void testAllFilesPresentInSpring() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("ultimate/testData/inspections/spring"), Pattern.compile("^(inspections\\.test)$"), TargetBackend.ANY);
    }

    @TestMetadata("autowiredMembersInInvalidClass/inspectionData/inspections.test")
    public void testAutowiredMembersInInvalidClass_inspectionData_Inspections_test() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/inspections/spring/autowiredMembersInInvalidClass/inspectionData/inspections.test");
        doTest(fileName);
    }

    @TestMetadata("autowiring/inspectionData/inspections.test")
    public void testAutowiring_inspectionData_Inspections_test() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/inspections/spring/autowiring/inspectionData/inspections.test");
        doTest(fileName);
    }

    @TestMetadata("componentScan/inspectionData/inspections.test")
    public void testComponentScan_inspectionData_Inspections_test() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/inspections/spring/componentScan/inspectionData/inspections.test");
        doTest(fileName);
    }

    @TestMetadata("finalSpringAnnotatedDeclaration/inspectionData/inspections.test")
    public void testFinalSpringAnnotatedDeclaration_inspectionData_Inspections_test() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/inspections/spring/finalSpringAnnotatedDeclaration/inspectionData/inspections.test");
        doTest(fileName);
    }

    @TestMetadata("unconfiguredFacet/inspectionData/inspections.test")
    public void testUnconfiguredFacet_inspectionData_Inspections_test() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/inspections/spring/unconfiguredFacet/inspectionData/inspections.test");
        doTest(fileName);
    }
}
