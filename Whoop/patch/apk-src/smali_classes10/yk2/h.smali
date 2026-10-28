.class public final synthetic Lyk2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lw41/f;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic w:Ly3/c;

.field public final synthetic x:Ltk2/m$b;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ly3/c;Ltk2/m$b;FFLw41/f;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyk2/h;->w:Ly3/c;

    iput-object p2, p0, Lyk2/h;->x:Ltk2/m$b;

    iput p3, p0, Lyk2/h;->y:F

    iput p4, p0, Lyk2/h;->z:F

    iput-object p5, p0, Lyk2/h;->E:Lw41/f;

    iput-object p6, p0, Lyk2/h;->F:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lyk2/h;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Ll0/v;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lyk2/h;->w:Ly3/c;

    iget-object v1, p0, Lyk2/h;->x:Ltk2/m$b;

    iget v2, p0, Lyk2/h;->y:F

    iget v3, p0, Lyk2/h;->z:F

    iget-object v4, p0, Lyk2/h;->E:Lw41/f;

    iget-object v5, p0, Lyk2/h;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lyk2/h;->G:I

    invoke-static/range {v0 .. v9}, Lyk2/l;->o(Ly3/c;Ltk2/m$b;FFLw41/f;Lkotlin/jvm/functions/Function1;ILl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
