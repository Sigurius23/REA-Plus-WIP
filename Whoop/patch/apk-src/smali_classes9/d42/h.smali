.class public final synthetic Ld42/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZZZLc93/a;Lc93/a;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld42/h;->w:Z

    iput-boolean p2, p0, Ld42/h;->x:Z

    iput-boolean p3, p0, Ld42/h;->y:Z

    iput-object p4, p0, Ld42/h;->z:Lc93/a;

    iput-object p5, p0, Ld42/h;->E:Lc93/a;

    iput-object p6, p0, Ld42/h;->F:Lc93/a;

    iput p7, p0, Ld42/h;->G:I

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

    iget-boolean v0, p0, Ld42/h;->w:Z

    iget-boolean v1, p0, Ld42/h;->x:Z

    iget-boolean v2, p0, Ld42/h;->y:Z

    iget-object v3, p0, Ld42/h;->z:Lc93/a;

    iget-object v4, p0, Ld42/h;->E:Lc93/a;

    iget-object v5, p0, Ld42/h;->F:Lc93/a;

    iget v6, p0, Ld42/h;->G:I

    invoke-static/range {v0 .. v8}, Ld42/j;->f(ZZZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
