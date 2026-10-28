.class public abstract Lrh/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf93/a;

.field public static final b:Lf93/a;

.field public static final c:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf93/a;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lrh/p;->a:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Lsh/n;->b:Lsh/n;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lrh/p;->b:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lrh/p;->c:Lf93/a;

    return-void
.end method
