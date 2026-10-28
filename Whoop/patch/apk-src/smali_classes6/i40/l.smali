.class public final Li40/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Li40/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li40/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li40/l;->w:Li40/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Ld0/t1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    const-string p3, "$this$animateFloat"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p3, 0x31941664

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    sget-object p3, Li40/i;->w:Li40/i;

    sget-object v0, Li40/i;->x:Li40/i;

    invoke-interface {p1, p3, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x43

    if-eqz v1, :cond_0

    sget-object p1, Ld0/b0;->c:Lb23/h;

    const/4 p3, 0x2

    invoke-static {v3, v2, p1, p3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-interface {p1, v0, p3}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    sget-object p3, Li40/i;->y:Li40/i;

    invoke-interface {p1, p3, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x7

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p3, p3, p1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Ld0/b0;->c:Lb23/h;

    new-instance p3, Ld0/e2;

    const/16 v0, 0x53

    invoke-direct {p3, v0, v3, p1}, Ld0/e2;-><init>(IILd0/z;)V

    move-object p1, p3

    :goto_1
    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    return-object p1
.end method
