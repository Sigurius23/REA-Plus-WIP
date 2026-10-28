.class final Lkv2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkv2/b;->s(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3;"
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


# static fields
.field public static final w:Lkv2/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkv2/b$a;

    invoke-direct {v0}, Lkv2/b$a;-><init>()V

    sput-object v0, Lkv2/b$a;->w:Lkv2/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo11/m$c$a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x6ec5d1c

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float p1, v0

    const/16 p3, 0x8

    int-to-float p3, p3

    mul-float v4, p1, p3

    const/4 v5, 0x7

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    mul-float/2addr v0, p3

    const/4 p3, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, p3, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo11/m$c$a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lkv2/b$a;->a(Lo11/m$c$a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
