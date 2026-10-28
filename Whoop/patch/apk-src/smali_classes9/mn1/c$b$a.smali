.class final Lmn1/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmn1/c$b;->a(Ll0/u;ZLandroidx/compose/runtime/Composer;I)V
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


# instance fields
.field final synthetic w:Lj31/k;


# direct methods
.method public constructor <init>(Lj31/k;)V
    .locals 0

    iput-object p1, p0, Lmn1/c$b$a;->w:Lj31/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le41/i;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "$unused$var$"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x7749709c

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    iget-object p3, p0, Lmn1/c$b$a;->w:Lj31/k;

    invoke-static {p1, p3}, Lj31/a;->a(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le41/i;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lmn1/c$b$a;->a(Le41/i;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
