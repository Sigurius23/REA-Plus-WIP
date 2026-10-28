.class public final Lf0/s;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/j2;


# instance fields
.field public Q:Lf0/o;

.field public R:F

.field public S:Li2/t;

.field public T:Li2/a1;

.field public final U:Lf2/c;


# direct methods
.method public constructor <init>(FLi2/t;Li2/a1;)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput p1, p0, Lf0/s;->R:F

    iput-object p2, p0, Lf0/s;->S:Li2/t;

    iput-object p3, p0, Lf0/s;->T:Li2/a1;

    new-instance p1, La6/i;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lf2/c;

    new-instance p3, Lf2/d;

    invoke-direct {p3}, Lf2/d;-><init>()V

    invoke-direct {p2, p3, p1}, Lf2/c;-><init>(Lf2/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2}, La3/o;->X0(La3/n;)La3/n;

    iput-object p2, p0, Lf0/s;->U:Lf2/c;

    return-void
.end method


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final n(Li3/z;)V
    .locals 0

    return-void
.end method
