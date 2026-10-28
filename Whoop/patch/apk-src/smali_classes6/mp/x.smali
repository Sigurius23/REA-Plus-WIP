.class public abstract Lmp/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lmp/x;
    .locals 1

    new-instance v0, Lmp/b0;

    invoke-direct {v0, p0}, Lmp/b0;-><init>(Lmp/x;)V

    return-object v0
.end method
