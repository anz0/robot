import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {

        // 创建机器人
        Robot robot = new Robot();
        // 设置默认休眠时间
        robot.setAutoDelay(300);

        // 按下alt键
        robot.keyPress(KeyEvent.VK_ALT);
        // 按下shift键
        robot.keyPress(KeyEvent.VK_SHIFT);
        // 按下n键
        robot.keyPress(KeyEvent.VK_N);

        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_N);

        // 连续两次上键
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);

        // 按下弹起回车键
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // 设置默认休眠时间20毫秒
        robot.setAutoDelay(20);
        for (String c : "class".split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // 如果是大写
                // 输入名字
                // 按下弹起CapsLock键，为了切换大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // 按下弹起CapsLock键，切换回原来的大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // 如果是小写
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // 设置默认休眠时间300毫秒
        robot.setAutoDelay(300);
        // 按下弹起回车键
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        String automaton = "Automaton";
        robot.setAutoDelay(20);
        for (String c : automaton.split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // 如果是大写
                // 按下弹起CapsLock键，为了切换大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // 按下弹起CapsLock键，切换回原来的大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // 如果是小写
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        robot.setAutoDelay(300);
        // 按下弹起回车键
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        // 连续三次下键
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        
        // 创建main方法
        // 设置默认休眠时间，让输入字母快一点
        robot.setAutoDelay(20);
        for (String c : "main".split("")) {

            if (Character.isUpperCase(c.charAt(0))) {
                // 如果是大写
                // 输入名字
                // 按下弹起CapsLock键，为了切换大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // 按下弹起CapsLock键，切换回原来的大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // 如果是小写
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // 设置休眠时间为300毫秒
        robot.setAutoDelay(300);
        // 按下弹起alt+/的快捷键
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SLASH);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SLASH);
        // 休眠500，过快自动提示可能不会出现
        robot.delay(500);
        // 按下弹起回车键
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // 设置默认休眠时间，让输入字母快一点
        robot.setAutoDelay(20);
        for (String c : "syso".split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // 如果是大写
                // 按下弹起CapsLock键，为了切换大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // 按下弹起CapsLock键，切换回原来的大小写
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // 如果是小写
                // 循环每个字符，根据字符取出map中存储的键值
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // 按下弹起alt+/的快捷键
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SLASH);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SLASH);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_QUOTE);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_QUOTE);
        // 休眠50，过快自动提示可能不会出现
        robot.delay(50);
        // 循环输入Hellow Word
        for (String c : "Hellow Word,I am a azzzzz".split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // 输入名字
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // 保存 按下弹起ctrl+s
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);
        // 运行 按下弹起ctrl+F11
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_F11);

    }
}