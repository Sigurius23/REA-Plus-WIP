.class public final Lui/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lwi/e;

.field public final c:Lj43/a;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lwi/e;Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Lj43/a;

    const/16 v1, 0x12

    invoke-direct {v0, p3, v1}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lui/a0;->a:Ljava/lang/Object;

    iput-object p2, p0, Lui/a0;->b:Lwi/e;

    iput-object v0, p0, Lui/a0;->c:Lj43/a;

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lui/a0;->c:Lj43/a;

    return-object v0
.end method

.method public final b()Lwi/e;
    .locals 1

    iget-object v0, p0, Lui/a0;->b:Lwi/e;

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lui/a0;->a:Ljava/lang/Object;

    return-object v0
.end method
