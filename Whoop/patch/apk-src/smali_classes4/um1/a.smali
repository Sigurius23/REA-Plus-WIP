.class public final synthetic Lum1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic w:Lo01/c;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lk31/d;


# direct methods
.method public synthetic constructor <init>(Lo01/c;ZZLk31/d;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lum1/a;->w:Lo01/c;

    iput-boolean p2, p0, Lum1/a;->x:Z

    iput-boolean p3, p0, Lum1/a;->y:Z

    iput-object p4, p0, Lum1/a;->z:Lk31/d;

    iput-object p5, p0, Lum1/a;->E:Lc93/a;

    iput p6, p0, Lum1/a;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lum1/a;->w:Lo01/c;

    iget-boolean v1, p0, Lum1/a;->x:Z

    iget-boolean v2, p0, Lum1/a;->y:Z

    iget-object v3, p0, Lum1/a;->z:Lk31/d;

    iget-object v4, p0, Lum1/a;->E:Lc93/a;

    iget v5, p0, Lum1/a;->F:I

    invoke-static/range {v0 .. v7}, Lum1/b;->a(Lo01/c;ZZLk31/d;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
