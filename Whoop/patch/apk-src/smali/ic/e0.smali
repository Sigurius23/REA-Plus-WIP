.class public interface abstract Lic/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lic/d0;

.field public static final b:Lic/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lic/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lic/e0;->a:Lic/d0;

    new-instance v0, Lic/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lic/e0;->b:Lic/c0;

    return-void
.end method
