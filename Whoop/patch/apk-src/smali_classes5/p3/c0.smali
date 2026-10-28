.class public final Lp3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/e0;
.implements Lp1/t2;


# instance fields
.field public final w:Lp3/c;


# direct methods
.method public constructor <init>(Lp3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/c0;->w:Lp3/c;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lp3/c0;->w:Lp3/c;

    iget-boolean v0, v0, Lp3/c;->E:Z

    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp3/c0;->w:Lp3/c;

    invoke-virtual {v0}, Lp3/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
