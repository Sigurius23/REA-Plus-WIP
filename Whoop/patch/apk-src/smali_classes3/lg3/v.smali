.class public abstract Llg3/v;
.super Llg3/s;
.source "SourceFile"


# static fields
.field public static final a:Lb2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/d;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lb2/d;-><init>(I)V

    sput-object v0, Llg3/v;->a:Lb2/d;

    return-void
.end method
