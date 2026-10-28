.class public abstract Lsr/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lsr/m;

.field public static final b:Lng3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lng3/n;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lsr/a;->b:Lng3/n;

    return-void
.end method
