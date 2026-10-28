.class public final Ll0/b0;
.super Ll0/f;
.source "SourceFile"


# instance fields
.field public final e:Ll0/a;


# direct methods
.method public constructor <init>(Ll0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/b0;->e:Ll0/a;

    return-void
.end method


# virtual methods
.method public final d(ILy3/m;Ly2/j1;I)I
    .locals 1

    iget-object v0, p0, Ll0/b0;->e:Ll0/a;

    iget-object v0, v0, Ll0/a;->a:Ly2/a;

    invoke-virtual {p3, v0}, Ly2/j1;->c0(Ly2/a;)I

    move-result p3

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_1

    sub-int/2addr p4, p3

    sget-object p3, Ly3/m;->x:Ly3/m;

    if-ne p2, p3, :cond_0

    sub-int/2addr p1, p4

    return p1

    :cond_0
    return p4

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Ly2/j1;)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Ll0/b0;->e:Ll0/a;

    iget-object v0, v0, Ll0/a;->a:Ly2/a;

    invoke-virtual {p1, v0}, Ly2/j1;->c0(Ly2/a;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
