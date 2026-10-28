.class public final Lx51/c$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx51/c;->g(Landroidx/compose/ui/Modifier;Lx51/d;Ld0/z1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
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
.field public static final w:Lx51/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx51/c$a;

    invoke-direct {v0}, Lx51/c$a;-><init>()V

    sput-object v0, Lx51/c$a;->w:Lx51/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ld0/t1;Landroidx/compose/runtime/Composer;I)Ld0/i1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/t1;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ld0/i1;"
        }
    .end annotation

    check-cast p2, Lp1/q;

    const p1, -0x2e941554

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    const/4 p3, 0x7

    const/4 v0, 0x0

    invoke-static {v0, v0, p3, p1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ld0/t1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lx51/c$a;->a(Ld0/t1;Landroidx/compose/runtime/Composer;I)Ld0/i1;

    move-result-object p1

    return-object p1
.end method
