.class public final Lmf/n;
.super Lmf/l;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final synthetic b:Lt9/u;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Lt9/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmf/n;->b:Lt9/u;

    iput-object p1, p0, Lmf/n;->a:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lmf/n;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d()Lyf/o;
    .locals 1

    iget-object v0, p0, Lmf/n;->b:Lt9/u;

    return-object v0
.end method
