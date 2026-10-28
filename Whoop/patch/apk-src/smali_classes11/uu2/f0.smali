.class public final synthetic Luu2/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lkd1/o;

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLkd1/o;FLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Luu2/f0;->w:Z

    iput-object p2, p0, Luu2/f0;->x:Lkd1/o;

    iput p3, p0, Luu2/f0;->y:F

    iput-object p4, p0, Luu2/f0;->z:Ljava/lang/String;

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

    iget-boolean v0, p0, Luu2/f0;->w:Z

    iget-object v1, p0, Luu2/f0;->x:Lkd1/o;

    iget v2, p0, Luu2/f0;->y:F

    iget-object v3, p0, Luu2/f0;->z:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Luu2/g0;->d(ZLkd1/o;FLjava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
