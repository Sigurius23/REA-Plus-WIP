.class public final Lcq/l;
.super Lcq/a;
.source "SourceFile"


# instance fields
.field public final a:Lcq/u;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcq/u;

    invoke-direct {v0}, Lcq/u;-><init>()V

    iput-object v0, p0, Lcq/l;->a:Lcq/u;

    return-void
.end method


# virtual methods
.method public final a(Lcq/g;)Lcq/l;
    .locals 2

    new-instance v0, Lro/i;

    invoke-direct {v0, p0, p1}, Lro/i;-><init>(Lcq/l;Lcq/g;)V

    iget-object p1, p0, Lcq/l;->a:Lcq/u;

    sget-object v1, Lcq/j;->a:Lcq/s;

    invoke-virtual {p1, v1, v0}, Lcq/u;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method
