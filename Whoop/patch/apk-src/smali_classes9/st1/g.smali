.class public final synthetic Lst1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lst1/g;->w:Ljava/util/List;

    iput-boolean p2, p0, Lst1/g;->x:Z

    iput p3, p0, Lst1/g;->y:F

    iput p4, p0, Lst1/g;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lst1/g;->z:F

    check-cast p1, Lk2/e;

    iget-object v1, p0, Lst1/g;->w:Ljava/util/List;

    iget-boolean v2, p0, Lst1/g;->x:Z

    iget v3, p0, Lst1/g;->y:F

    invoke-static {v1, v2, v3, v0, p1}, Lst1/h;->b(Ljava/util/List;ZFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
