.class public final synthetic Lvy0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:F

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;FLc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/e;->w:Ljava/lang/String;

    iput p2, p0, Lvy0/e;->x:F

    iput-object p3, p0, Lvy0/e;->y:Lc93/a;

    iput p4, p0, Lvy0/e;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lvy0/e;->w:Ljava/lang/String;

    iget v1, p0, Lvy0/e;->x:F

    iget-object v2, p0, Lvy0/e;->y:Lc93/a;

    iget v3, p0, Lvy0/e;->z:I

    invoke-static/range {v0 .. v5}, Lvy0/p;->M(Ljava/lang/String;FLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
