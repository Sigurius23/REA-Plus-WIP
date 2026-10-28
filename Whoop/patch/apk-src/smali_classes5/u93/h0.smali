.class public final Lu93/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lu93/h0;

.field public static final b:Lbd3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu93/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu93/h0;->a:Lu93/h0;

    new-instance v0, Lbd3/e0;

    const-string v1, "PackageViewDescriptorFactory"

    invoke-direct {v0, v1}, Lbd3/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu93/h0;->b:Lbd3/e0;

    return-void
.end method
