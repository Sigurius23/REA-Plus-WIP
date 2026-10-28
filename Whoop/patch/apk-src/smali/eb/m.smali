.class public final Leb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Leb/k;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Leb/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Leb/m;->a:Leb/k;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iput-object p1, p0, Leb/m;->b:Ljava/lang/Object;

    iget-object v0, p0, Leb/m;->a:Leb/k;

    iput-object p1, v0, Leb/k;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Leb/k;->b:Z

    return-void
.end method

.method public final b(Leb/g1;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/m;->a:Leb/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Leb/k;->c:Ljava/lang/Object;

    return-void
.end method
