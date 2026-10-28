package p474s;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import hm.C17417d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p185h6.C16955j;
import p244j6.C21357b;
import p244j6.C21360e;
import p244j6.C21364i;
import p244j6.RunnableC21363h;
import p290l.AbstractC22932a;
import p497t7.InterfaceC33561b;
import p572w4.AbstractC36797c;
import p572w4.InterfaceC36796b;
import p619xl.C38445a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s.w */
/* JADX INFO: loaded from: classes5.dex */
public class C32020w implements InterfaceC32005s0 {

    /* JADX INFO: renamed from: d */
    public static final int[] f132877d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132878a;

    /* JADX INFO: renamed from: b */
    public final View f132879b;

    /* JADX INFO: renamed from: c */
    public Object f132880c;

    public C32020w(AbsSeekBar absSeekBar) {
        this.f132878a = 0;
        this.f132879b = absSeekBar;
    }

    @Override // p474s.InterfaceC32005s0
    /* JADX INFO: renamed from: a */
    public void mo99556a(int i13) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i13);
    }

    @Override // p474s.InterfaceC32005s0
    /* JADX INFO: renamed from: b */
    public void mo99557b(int i13, float f13) {
    }

    @Override // p474s.InterfaceC32005s0
    /* JADX INFO: renamed from: c */
    public void mo99558c(int i13) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i13);
    }

    /* JADX INFO: renamed from: d */
    public KeyListener m99574d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C38445a) ((C17417d) this.f132880c).f67507x).getClass();
        if (keyListener instanceof C21360e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C21360e(keyListener);
    }

    /* JADX INFO: renamed from: e */
    public void mo99418e(AttributeSet attributeSet, int i13) {
        switch (this.f132878a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f132879b;
                C31983m2 c31983m2M99479q = C31983m2.m99479q(absSeekBar.getContext(), attributeSet, f132877d, i13);
                Drawable drawableM99487k = c31983m2M99479q.m99487k(0);
                if (drawableM99487k != null) {
                    if (drawableM99487k instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM99487k;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i14 = 0; i14 < numberOfFrames; i14++) {
                            Drawable drawableM99577h = m99577h(animationDrawable.getFrame(i14), true);
                            drawableM99577h.setLevel(InterfaceC33561b.INVALID_OWNERSHIP);
                            animationDrawable2.addFrame(drawableM99577h, animationDrawable.getDuration(i14));
                        }
                        animationDrawable2.setLevel(InterfaceC33561b.INVALID_OWNERSHIP);
                        drawableM99487k = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM99487k);
                }
                Drawable drawableM99487k2 = c31983m2M99479q.m99487k(1);
                if (drawableM99487k2 != null) {
                    absSeekBar.setProgressDrawable(m99577h(drawableM99487k2, false));
                }
                c31983m2M99479q.m99491r();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f132879b).getContext().obtainStyledAttributes(attributeSet, AbstractC22932a.f90516i, i13, 0);
                try {
                    boolean z4 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z4 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m99576g(z4);
                    return;
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th3;
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public C21357b m99575f(InputConnection inputConnection, EditorInfo editorInfo) {
        C17417d c17417d = (C17417d) this.f132880c;
        if (inputConnection == null) {
            c17417d.getClass();
            inputConnection = null;
        } else {
            C38445a c38445a = (C38445a) c17417d.f67507x;
            c38445a.getClass();
            if (!(inputConnection instanceof C21357b)) {
                inputConnection = new C21357b((EditText) c38445a.f164636x, inputConnection, editorInfo);
            }
        }
        return (C21357b) inputConnection;
    }

    /* JADX INFO: renamed from: g */
    public void m99576g(boolean z4) {
        C21364i c21364i = (C21364i) ((C38445a) ((C17417d) this.f132880c).f67507x).f164637y;
        if (c21364i.f81714y != z4) {
            if (c21364i.f81713x != null) {
                C16955j c16955jM47708a = C16955j.m47708a();
                RunnableC21363h runnableC21363h = c21364i.f81713x;
                c16955jM47708a.getClass();
                AbstractC37056f.m118993q(runnableC21363h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c16955jM47708a.f65079a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c16955jM47708a.f65080b.remove(runnableC21363h);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th3) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th3;
                }
            }
            c21364i.f81714y = z4;
            if (z4) {
                C21364i.m59958a(c21364i.f81712w, C16955j.m47708a().m47711c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public Drawable m99577h(Drawable drawable, boolean z4) {
        if (drawable instanceof InterfaceC36796b) {
            ((AbstractC36797c) ((InterfaceC36796b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i13 = 0; i13 < numberOfLayers; i13++) {
                    int id4 = layerDrawable.getId(i13);
                    drawableArr[i13] = m99577h(layerDrawable.getDrawable(i13), id4 == 16908301 || id4 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i14 = 0; i14 < numberOfLayers; i14++) {
                    layerDrawable2.setId(i14, layerDrawable.getId(i14));
                    layerDrawable2.setLayerGravity(i14, layerDrawable.getLayerGravity(i14));
                    layerDrawable2.setLayerWidth(i14, layerDrawable.getLayerWidth(i14));
                    layerDrawable2.setLayerHeight(i14, layerDrawable.getLayerHeight(i14));
                    layerDrawable2.setLayerInsetLeft(i14, layerDrawable.getLayerInsetLeft(i14));
                    layerDrawable2.setLayerInsetRight(i14, layerDrawable.getLayerInsetRight(i14));
                    layerDrawable2.setLayerInsetTop(i14, layerDrawable.getLayerInsetTop(i14));
                    layerDrawable2.setLayerInsetBottom(i14, layerDrawable.getLayerInsetBottom(i14));
                    layerDrawable2.setLayerInsetStart(i14, layerDrawable.getLayerInsetStart(i14));
                    layerDrawable2.setLayerInsetEnd(i14, layerDrawable.getLayerInsetEnd(i14));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f132880c) == null) {
                    this.f132880c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C32020w(EditText editText) {
        this.f132878a = 1;
        this.f132879b = editText;
        this.f132880c = new C17417d(editText);
    }

    public C32020w(AppCompatTextView appCompatTextView) {
        this.f132878a = 2;
        this.f132880c = appCompatTextView;
        this.f132878a = 2;
        this.f132879b = appCompatTextView;
    }
}
