.class public final Ly2/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/b2;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ly2/p;

.field public final d:Ly2/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/c2;->b:Ljava/lang/String;

    new-instance v0, Ly2/p;

    invoke-direct {v0, p1}, Ly2/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ly2/c2;->c:Ly2/p;

    const-string v0, " maximum"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ly2/p;

    invoke-direct {v0, p1}, Ly2/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ly2/c2;->d:Ly2/p;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly2/c2;->b:Ljava/lang/String;

    return-object v0
.end method
