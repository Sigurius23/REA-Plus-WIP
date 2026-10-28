.class public final synthetic Lqi/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:Lqi/w;


# direct methods
.method public synthetic constructor <init>(Lqi/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/r;->a:Lqi/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lqi/r;->a:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->o()V

    return-void
.end method
