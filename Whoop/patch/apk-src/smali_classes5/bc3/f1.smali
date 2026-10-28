.class public final Lbc3/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/g1;


# instance fields
.field public final w:Lbc3/x1;


# direct methods
.method public constructor <init>(Lbc3/x1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc3/f1;->w:Lbc3/x1;

    return-void
.end method


# virtual methods
.method public final b()Lbc3/x1;
    .locals 1

    iget-object v0, p0, Lbc3/f1;->w:Lbc3/x1;

    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
