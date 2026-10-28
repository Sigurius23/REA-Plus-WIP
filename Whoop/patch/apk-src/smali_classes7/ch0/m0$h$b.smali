.class final Lch0/m0$h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/m0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lg2/i;

.field final synthetic x:Z

.field final synthetic y:Lf0/r1;


# direct methods
.method public constructor <init>(Lg2/i;ZLf0/r1;)V
    .locals 0

    iput-object p1, p0, Lch0/m0$h$b;->w:Lg2/i;

    iput-boolean p2, p0, Lch0/m0$h$b;->x:Z

    iput-object p3, p0, Lch0/m0$h$b;->y:Lf0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(FLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/high16 v0, -0x3db80000    # -50.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    iget-object v0, p0, Lch0/m0$h$b;->w:Lg2/i;

    invoke-static {v0}, Lg2/i;->a(Lg2/i;)V

    :cond_0
    iget-boolean v0, p0, Lch0/m0$h$b;->x:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lch0/m0$h$b;->y:Lf0/r1;

    sget-object v1, Lf0/z0;->w:Lf0/z0;

    new-instance v2, Lch0/m0$h$b$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lch0/m0$h$b$a;-><init>(FLq83/d;)V

    invoke-virtual {v0, v1, v2, p2}, Lf0/r1;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Lch0/m0$h$b;->b(FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
