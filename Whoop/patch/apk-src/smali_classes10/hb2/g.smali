.class public final synthetic Lhb2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/util/List;

.field public final synthetic F:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb2/g;->w:Ljava/lang/String;

    iput-object p2, p0, Lhb2/g;->x:Ljava/lang/String;

    iput-object p3, p0, Lhb2/g;->y:Ljava/lang/String;

    iput p4, p0, Lhb2/g;->z:I

    iput-object p5, p0, Lhb2/g;->E:Ljava/util/List;

    iput p6, p0, Lhb2/g;->F:I

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

    iget-object v0, p0, Lhb2/g;->w:Ljava/lang/String;

    iget-object v1, p0, Lhb2/g;->x:Ljava/lang/String;

    iget-object v2, p0, Lhb2/g;->y:Ljava/lang/String;

    iget v3, p0, Lhb2/g;->z:I

    iget-object v4, p0, Lhb2/g;->E:Ljava/util/List;

    iget v5, p0, Lhb2/g;->F:I

    invoke-static/range {v0 .. v7}, Lhb2/j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
