package p002a0;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.internal.EnumDescriptor;
import m83.AbstractC25242e;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: a0.i1 */
/* JADX INFO: loaded from: classes.dex */
public class C0030i1 implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80w;

    /* JADX INFO: renamed from: x */
    public int f81x;

    /* JADX INFO: renamed from: y */
    public final Object f82y;

    public /* synthetic */ C0030i1(Object obj, int i13) {
        this.f80w = i13;
        this.f82y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f80w) {
            case 0:
                return this.f81x < ((C0024g1) this.f82y).m58g();
            case 1:
                return this.f81x < ((Object[]) this.f82y).length;
            case 2:
                return this.f81x < ((AbstractC25242e) this.f82y).mo73980a();
            case 3:
                return this.f81x > 0;
            default:
                return this.f81x > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f80w) {
            case 0:
                C0024g1 c0024g1 = (C0024g1) this.f82y;
                int i13 = this.f81x;
                this.f81x = i13 + 1;
                return c0024g1.m59h(i13);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f82y;
                    int i14 = this.f81x;
                    this.f81x = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    this.f81x--;
                    throw new NoSuchElementException(e5.getMessage());
                }
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC25242e abstractC25242e = (AbstractC25242e) this.f82y;
                int i15 = this.f81x;
                this.f81x = i15 + 1;
                return abstractC25242e.get(i15);
            case 3:
                InterfaceC39443g interfaceC39443g = (InterfaceC39443g) this.f82y;
                int elementsCount = interfaceC39443g.getElementsCount();
                int i16 = this.f81x;
                this.f81x = i16 - 1;
                return interfaceC39443g.getElementDescriptor(elementsCount - i16);
            default:
                EnumDescriptor enumDescriptor = (EnumDescriptor) this.f82y;
                int elementsCount2 = enumDescriptor.getElementsCount();
                int i17 = this.f81x;
                this.f81x = i17 - 1;
                return enumDescriptor.getElementName(elementsCount2 - i17);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f80w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0030i1(Object[] array) {
        this.f80w = 1;
        AbstractC22676k.m65750j(array, "array");
        this.f82y = array;
    }

    public C0030i1(InterfaceC39443g interfaceC39443g) {
        this.f80w = 3;
        this.f82y = interfaceC39443g;
        this.f81x = interfaceC39443g.getElementsCount();
    }

    public C0030i1(EnumDescriptor enumDescriptor) {
        this.f80w = 4;
        this.f82y = enumDescriptor;
        this.f81x = enumDescriptor.getElementsCount();
    }
}
