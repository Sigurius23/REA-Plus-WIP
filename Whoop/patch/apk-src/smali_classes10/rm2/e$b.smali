.class final synthetic Lrm2/e$b;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrm2/e;->R(Lrm2/f;Leb/u0;Lii0/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lc93/a;"
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "popBackStack()Z"

    const/16 v2, 0x8

    const/4 v1, 0x0

    const-class v3, Leb/u0;

    const-string v5, "popBackStack"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrm2/e$b;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    return-void
.end method
