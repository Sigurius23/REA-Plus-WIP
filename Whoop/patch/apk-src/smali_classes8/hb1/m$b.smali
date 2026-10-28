.class final synthetic Lhb1/m$b;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb1/m;->z(Landroidx/compose/ui/Modifier;Lhb1/n;Lkotlin/jvm/functions/Function1;Liy1/c;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/n;"
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

    const-string v6, "detect-jYbf7pk(JIILandroidx/compose/ui/unit/Density;)Ljava/lang/String;"

    const/4 v2, 0x0

    const/4 v1, 0x4

    const-class v3, Lhb1/c;

    const-string v5, "detect"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(JIILy3/c;)Ljava/lang/String;
    .locals 7

    const-string v0, "p3"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhb1/c;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lhb1/c;->a(JIILy3/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ly3/a;

    iget-wide v1, p1, Ly3/a;->a:J

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object v5, p4

    check-cast v5, Ly3/c;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lhb1/m$b;->a(JIILy3/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
