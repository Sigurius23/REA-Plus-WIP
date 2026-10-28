.class public final synthetic Lim1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Ljava/util/ArrayList;

.field public final synthetic y:Lim1/d0;

.field public final synthetic z:Lfm1/d;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/ArrayList;Lim1/d0;Lfm1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lim1/a;->w:Z

    iput-object p2, p0, Lim1/a;->x:Ljava/util/ArrayList;

    iput-object p3, p0, Lim1/a;->y:Lim1/d0;

    iput-object p4, p0, Lim1/a;->z:Lfm1/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v0, p0, Lim1/a;->w:Z

    iget-object v1, p0, Lim1/a;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Lim1/a;->y:Lim1/d0;

    iget-object v3, p0, Lim1/a;->z:Lfm1/d;

    invoke-static/range {v0 .. v6}, Lim1/b;->d(ZLjava/util/ArrayList;Lim1/d0;Lfm1/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
