.class public final Lsa3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lsa3/j;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsa3/j;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1}, Lsa3/j;-><init>(Ljava/util/List;)V

    sput-object v0, Lsa3/j;->b:Lsa3/j;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsa3/j;->a:Ljava/util/List;

    return-void
.end method
