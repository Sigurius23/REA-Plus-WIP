.class public final Lbc3/v0;
.super Lbc3/x0;
.source "SourceFile"


# instance fields
.field public final y:Lbc3/m;

.field public final synthetic z:Lbc3/z0;


# direct methods
.method public constructor <init>(Lbc3/z0;JLbc3/m;)V
    .locals 0

    iput-object p1, p0, Lbc3/v0;->z:Lbc3/z0;

    invoke-direct {p0, p2, p3}, Lbc3/x0;-><init>(J)V

    iput-object p4, p0, Lbc3/v0;->y:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbc3/v0;->y:Lbc3/m;

    iget-object v1, p0, Lbc3/v0;->z:Lbc3/z0;

    invoke-virtual {v0, v1}, Lbc3/m;->C(Lbc3/z;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lbc3/x0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbc3/v0;->y:Lbc3/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
