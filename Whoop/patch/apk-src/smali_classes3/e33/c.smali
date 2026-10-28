.class public final Le33/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Le33/n;


# direct methods
.method public constructor <init>(Le33/n;)V
    .locals 0

    iput-object p1, p0, Le33/c;->w:Le33/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le33/c;->w:Le33/n;

    iget-object v0, v0, Le33/n;->w:Lt23/x1;

    iget-object v0, v0, Lt23/x1;->f:Lt23/a2;

    iget-object v0, v0, Lt23/a2;->r:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/AudioBitrateProfile;

    return-object v0
.end method
