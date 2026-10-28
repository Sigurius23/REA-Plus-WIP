.class public final Lv6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/i;


# instance fields
.field public a:Ln6/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ln6/m;->a:Ln6/m;

    iput-object v0, p0, Lv6/m;->a:Ln6/o;

    return-void
.end method


# virtual methods
.method public final a()Ln6/i;
    .locals 2

    new-instance v0, Lv6/m;

    invoke-direct {v0}, Lv6/m;-><init>()V

    iget-object v1, p0, Lv6/m;->a:Ln6/o;

    iput-object v1, v0, Lv6/m;->a:Ln6/o;

    return-object v0
.end method

.method public final b(Ln6/o;)V
    .locals 0

    iput-object p1, p0, Lv6/m;->a:Ln6/o;

    return-void
.end method

.method public final c()Ln6/o;
    .locals 1

    iget-object v0, p0, Lv6/m;->a:Ln6/o;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EmittableSpacer(modifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv6/m;->a:Ln6/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
