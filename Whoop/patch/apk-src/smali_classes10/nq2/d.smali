.class public final synthetic Lnq2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lnq2/a;

.field public final synthetic y:I

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lnq2/a;IZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq2/d;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lnq2/d;->x:Lnq2/a;

    iput p3, p0, Lnq2/d;->y:I

    iput-boolean p4, p0, Lnq2/d;->z:Z

    iput-boolean p5, p0, Lnq2/d;->E:Z

    iput p6, p0, Lnq2/d;->F:I

    iput p7, p0, Lnq2/d;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lnq2/d;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lnq2/d;->x:Lnq2/a;

    iget v2, p0, Lnq2/d;->y:I

    iget-boolean v3, p0, Lnq2/d;->z:Z

    iget-boolean v4, p0, Lnq2/d;->E:Z

    iget v5, p0, Lnq2/d;->F:I

    iget v6, p0, Lnq2/d;->G:I

    invoke-static/range {v0 .. v8}, Lnq2/e;->g(Landroidx/compose/ui/Modifier;Lnq2/a;IZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
