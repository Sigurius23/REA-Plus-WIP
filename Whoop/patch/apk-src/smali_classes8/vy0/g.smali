.class public final synthetic Lvy0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Z

.field public final synthetic J:Lc93/a;

.field public final synthetic w:Z

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZLc93/a;ZLc93/a;ZZZLc93/a;ZLc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lvy0/g;->w:Z

    iput-object p2, p0, Lvy0/g;->x:Lc93/a;

    iput-boolean p3, p0, Lvy0/g;->y:Z

    iput-object p4, p0, Lvy0/g;->z:Lc93/a;

    iput-boolean p5, p0, Lvy0/g;->E:Z

    iput-boolean p6, p0, Lvy0/g;->F:Z

    iput-boolean p7, p0, Lvy0/g;->G:Z

    iput-object p8, p0, Lvy0/g;->H:Lc93/a;

    iput-boolean p9, p0, Lvy0/g;->I:Z

    iput-object p10, p0, Lvy0/g;->J:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-boolean v0, p0, Lvy0/g;->w:Z

    iget-object v1, p0, Lvy0/g;->x:Lc93/a;

    iget-boolean v2, p0, Lvy0/g;->y:Z

    iget-object v3, p0, Lvy0/g;->z:Lc93/a;

    iget-boolean v4, p0, Lvy0/g;->E:Z

    iget-boolean v5, p0, Lvy0/g;->F:Z

    iget-boolean v6, p0, Lvy0/g;->G:Z

    iget-object v7, p0, Lvy0/g;->H:Lc93/a;

    iget-boolean v8, p0, Lvy0/g;->I:Z

    iget-object v9, p0, Lvy0/g;->J:Lc93/a;

    invoke-static/range {v0 .. v11}, Lvy0/p;->m(ZLc93/a;ZLc93/a;ZZZLc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
