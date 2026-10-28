.class public La92/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La92/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:La92/a;


# direct methods
.method public constructor <init>(La92/a;)V
    .locals 0

    iput-object p1, p0, La92/a$b;->a:La92/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, La92/a$b;->a:La92/a;

    invoke-static {v0, p0}, La92/a;->c(La92/a;La92/a$b;)V

    return-void
.end method
