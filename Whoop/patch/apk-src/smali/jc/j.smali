.class public final synthetic Ljc/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljc/d;


# instance fields
.field public final synthetic w:Ljava/util/concurrent/Executor;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lic/b;

.field public final synthetic z:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/u1;Ljava/util/List;Lic/b;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/j;->w:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ljc/j;->x:Ljava/util/List;

    iput-object p3, p0, Ljc/j;->y:Lic/b;

    iput-object p4, p0, Ljc/j;->z:Landroidx/work/impl/WorkDatabase;

    return-void
.end method


# virtual methods
.method public final b(Lqc/j;Z)V
    .locals 6

    new-instance v0, Lij/a;

    const/4 v5, 0x2

    iget-object v1, p0, Ljc/j;->x:Ljava/util/List;

    iget-object v3, p0, Ljc/j;->y:Lic/b;

    iget-object v4, p0, Ljc/j;->z:Landroidx/work/impl/WorkDatabase;

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lij/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Ljc/j;->w:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
