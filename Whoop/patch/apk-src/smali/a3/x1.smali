.class public final La3/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b2;


# instance fields
.field public final w:La3/w1;


# direct methods
.method public constructor <init>(La3/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/x1;->w:La3/w1;

    return-void
.end method


# virtual methods
.method public final U()Z
    .locals 1

    iget-object v0, p0, La3/x1;->w:La3/w1;

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    return v0
.end method
