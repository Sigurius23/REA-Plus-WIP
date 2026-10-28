.class public abstract Llg/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "[^\\x20-\\x7E]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Llg/e;->a:Lyb3/p;

    return-void
.end method
