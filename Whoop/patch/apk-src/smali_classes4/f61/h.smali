.class public final synthetic Lf61/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ly81/e;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Lf61/i;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lg61/c;


# direct methods
.method public synthetic constructor <init>(Lf61/i;ZZLg61/c;ZLy81/e;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/h;->w:Lf61/i;

    iput-boolean p2, p0, Lf61/h;->x:Z

    iput-boolean p3, p0, Lf61/h;->y:Z

    iput-object p4, p0, Lf61/h;->z:Lg61/c;

    iput-boolean p5, p0, Lf61/h;->E:Z

    iput-object p6, p0, Lf61/h;->F:Ly81/e;

    iput p7, p0, Lf61/h;->G:I

    iput p8, p0, Lf61/h;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lf61/h;->w:Lf61/i;

    iget-boolean v1, p0, Lf61/h;->x:Z

    iget-boolean v2, p0, Lf61/h;->y:Z

    iget-object v3, p0, Lf61/h;->z:Lg61/c;

    iget-boolean v4, p0, Lf61/h;->E:Z

    iget-object v5, p0, Lf61/h;->F:Ly81/e;

    iget v6, p0, Lf61/h;->G:I

    iget v7, p0, Lf61/h;->H:I

    invoke-static/range {v0 .. v9}, Lf61/i;->j(Lf61/i;ZZLg61/c;ZLy81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
