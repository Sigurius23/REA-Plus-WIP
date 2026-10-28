.class public final synthetic Lx51/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Lx51/a;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lx51/a;FFLkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx51/b;->w:Lx51/a;

    iput p2, p0, Lx51/b;->x:F

    iput p3, p0, Lx51/b;->y:F

    iput-object p4, p0, Lx51/b;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lx51/b;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lx51/b;->w:Lx51/a;

    iget v1, p0, Lx51/b;->x:F

    iget v2, p0, Lx51/b;->y:F

    iget-object v3, p0, Lx51/b;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lx51/b;->E:I

    invoke-static/range {v0 .. v6}, Lx51/c;->a(Lx51/a;FFLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
