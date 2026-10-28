.class public final synthetic Ld1/a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ld1/k;


# direct methods
.method public constructor <init>(Ld1/k;)V
    .locals 6

    iput-object p1, p0, Ld1/a;->w:Ld1/k;

    const-string v4, "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lkotlin/jvm/internal/j;

    const-string v3, "localToScreen"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Li2/l0;

    iget-object p1, p1, Li2/l0;->a:[F

    iget-object v0, p0, Ld1/a;->w:Ld1/k;

    iget-object v0, v0, Ld1/k;->R:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0, p1}, Ly2/y;->N([F)V

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
