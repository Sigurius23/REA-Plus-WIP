.class public final synthetic Lic/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld4/j;


# instance fields
.field public final synthetic E:Landroidx/lifecycle/u0;

.field public final synthetic w:Ljava/util/concurrent/Executor;

.field public final synthetic x:Lic/y;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lic/y;Ljava/lang/String;Lc93/a;Landroidx/lifecycle/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/g0;->w:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lic/g0;->x:Lic/y;

    iput-object p3, p0, Lic/g0;->y:Ljava/lang/String;

    iput-object p4, p0, Lic/g0;->z:Lc93/a;

    iput-object p5, p0, Lic/g0;->E:Landroidx/lifecycle/u0;

    return-void
.end method


# virtual methods
.method public final d(Ld4/i;)Ljava/lang/Object;
    .locals 6

    new-instance v0, Lic/h0;

    iget-object v1, p0, Lic/g0;->x:Lic/y;

    iget-object v2, p0, Lic/g0;->y:Ljava/lang/String;

    iget-object v3, p0, Lic/g0;->z:Lc93/a;

    iget-object v4, p0, Lic/g0;->E:Landroidx/lifecycle/u0;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lic/h0;-><init>(Lic/y;Ljava/lang/String;Lc93/a;Landroidx/lifecycle/u0;Ld4/i;)V

    iget-object p1, p0, Lic/g0;->w:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
