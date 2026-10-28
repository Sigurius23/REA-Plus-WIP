.class public final Lgb/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Leb/q;

.field public final synthetic x:Z

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public constructor <init>(Leb/q;Ljava/util/List;Z)V
    .locals 0

    iput-object p1, p0, Lgb/o;->w:Leb/q;

    iput-boolean p3, p0, Lgb/o;->x:Z

    iput-object p2, p0, Lgb/o;->y:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lp1/i0;

    new-instance p1, Lgb/n;

    iget-object v0, p0, Lgb/o;->w:Leb/q;

    iget-object v1, p0, Lgb/o;->y:Ljava/util/List;

    iget-boolean v2, p0, Lgb/o;->x:Z

    invoke-direct {p1, v0, v1, v2}, Lgb/n;-><init>(Leb/q;Ljava/util/List;Z)V

    iget-object v1, v0, Leb/q;->H:Landroidx/lifecycle/i0;

    invoke-virtual {v1, p1}, Landroidx/lifecycle/i0;->a(Landroidx/lifecycle/f0;)V

    new-instance v1, Ld0/b2;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, p1}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
