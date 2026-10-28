.class public abstract Lot/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmt/a;


# static fields
.field public static final a:Lnt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnt/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lnt/a;-><init>(I)V

    sput-object v0, Lot/g;->a:Lnt/a;

    return-void
.end method
